package mage.client.game;

import java.util.UUID;
import mage.client.components.MageUI;
//import mage.interfaces.MageClient;
//import mage.interfaces.callback.ClientCallback;
import mage.remote.Connection;
//import mage.remote.Session;
//import mage.remote.SessionImpl;
import mage.utils.MageVersion;
import org.apache.log4j.Logger;
import org.junit.Ignore;

import javax.swing.*;
import java.util.concurrent.CountDownLatch;
import mage.interfaces.ServerState;
import mage.view.ChatMessage;
import org.mage.network.Client;
import org.mage.network.interfaces.MageClient;
import org.mage.network.model.MessageType;

/**
 * Test for emulating the connection from multi mage clients.
 *
 * @author ayratn
 */
@Ignore
public class MultiConnectTest {

    private static final Logger logger = Logger.getLogger(MultiConnectTest.class);

    /**
     * Amount of games to be started from this test.
     */
    private static final Integer USER_CONNECT_COUNT = 200;

    private static final CountDownLatch latch = new CountDownLatch(USER_CONNECT_COUNT);

    private static final MageVersion version = new MageVersion(MageVersion.MAGE_VERSION_MAJOR, MageVersion.MAGE_VERSION_MINOR, MageVersion.MAGE_VERSION_PATCH,  MageVersion.MAGE_VERSION_MINOR_PATCH, MageVersion.MAGE_VERSION_INFO);

    private static volatile int connected;

    private final Object sync = new Object();
    private MageUI ui;

    private class ClientMock implements MageClient {

        private Client client;
        private final String username;
        private ServerState serverState;

        public ClientMock(String username) {
            this.username = username;
        }

        public void connect() {
            client = new Client(this);
            Connection connection = new Connection();
            connection.setUsername(username);
            connection.setHost("localhost");
            connection.setPort(17171);
            connection.setProxyType(Connection.ProxyType.NONE);

            client.connect(username, "localhost", 17171, true, version);
        }

        public MageVersion getVersion() {
            logger.info("getVersion");
            return version;
        }

        @Override
        public void connected(String message) {
            logger.info("connected: " + message);
            connected++;
        }

        @Override
        public void disconnected(boolean errorCall) {
            logger.info("disconnected");
        }

        public void showMessage(String message) {
            logger.info("showMessage: " + message);
        }

        public void showError(String message) {
            logger.info("showError: " + message);
        }

//        @Override
//        public void processCallback(ClientCallback callback) {
//            logger.info("processCallback");
//        }

        @Override
        public void inform(String message, MessageType type) {
            if (type == MessageType.ERROR) {
                showError(message);
            }
            else {
                showMessage(message);
            }
        }

        @Override
        public void receiveChatMessage(UUID chatId, ChatMessage message) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void receiveBroadcastMessage(String message) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void clientRegistered(ServerState state) {
            this.serverState = state;
        }

        @Override
        public ServerState getServerState() {
            return serverState;
        }
    }

    public static void main(String[] argv) throws Exception {
        new MultiConnectTest().startMultiGames();
    }

    public void startMultiGames() throws Exception {
        for (int i = 0; i < USER_CONNECT_COUNT; i++) {
            logger.info("Starting game");
            connect(i);
        }
        latch.await();
        logger.info("Finished");
        logger.info("Connected: " + connected + " of " + USER_CONNECT_COUNT);
    }

    private void connect(final int index) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                logger.fatal(null, e);
            }
        });
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String username = "player" + index;
                ClientMock client = new ClientMock(username);
                client.connect();
                latch.countDown();
            }
        });
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            logger.error("Error", e);
        }
    }
}
