package view;

import contract.*;
import fr.exia.showboard.BoardFrame;
import contract.IMobile;
import contract.IMap;
import contract.IView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;


/**
 * <h1>The View Class.</h1>
 *
 * @author Groupe 1
 * @version 0.1
 */

public class View implements Runnable, KeyListener, IView {

	/**
	 * The Constant mapView.
	 */
	private static final int mapView = 31;

	/**
	 * The Constant closeView.
	 */
	private Rectangle closeView;

	/**
	 * The map.
	 */
	private IMap map;

	/**
	 * My player.
	 */
	private IMobile myPlayer;

	/**
	 * The view.
	 */
	private int view;

	/**
	 * The order performer.
	 */
	private IOrderPerformer orderPerformer;

	final BoardFrame boardFrame = new BoardFrame("BoulderDash");

	/**
	 * Instantiates a new boulderdash View.
	 *
	 * @param map      the map
	 * @param myPlayer the my player
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public View(final IMap map, final IMobile myPlayer) throws IOException {
		this.setView(mapView);
		this.setMap(map);
		this.setMyPlayer(myPlayer);
		this.getMyPlayer().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getMyPlayer().getY(), this.getMap().getWidth(), mapView));
		SwingUtilities.invokeLater(this);
	}

	public static UserOrder keyCodeToControllerOrder(int keyCode) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.boulderdash.contract.intview.IView#displayMessage(java.lang.String)
	 */

	//@Override
	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
		System.exit(0);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public final void run() {
		boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
		boardFrame.setDisplayFrame(this.closeView);
		boardFrame.setLocation(500, 50);
		boardFrame.setSize(1000, 1000);
		boardFrame.setHeightLooped(false);
		boardFrame.addKeyListener(this);
		boardFrame.setFocusable(true);
		boardFrame.setFocusTraversalKeysEnabled(false);

		refresh();

		boardFrame.addPawn(this.getMyPlayer());
		this.getMap().getObservable().addObserver(boardFrame.getObserver());
		this.followMyPlayer();
		boardFrame.setVisible(true);
	}

	public final void refresh() {
		for (int x = 0; x < this.getMap().getWidth(); x++) {
			for (int y = 0; y < this.getMap().getHeight(); y++) {
				boardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);
			}
		}
	}

	/**
	 * Prints the map and the player's character in the console.
	 *
	 * @param yStart the y start
	 */
	public final void show(final int yStart) {
		int y = yStart % this.getMap().getHeight();
		for (int view = 0; view < this.getView(); view++) {
			for (int x = 0; x < this.getMap().getWidth(); x++) {
				if ((x == this.getMyPlayer().getX()) && (y == yStart)) {
					System.out.print(this.getMyPlayer().getSprite().getConsoleImage());
				} else {
					System.out.print(this.getMap().getOnTheMapXY(x, y).getSprite().getConsoleImage());
				}
			}
			y = (y + 1) % this.getMap().getHeight();
			System.out.print("\n");
		}
	}

	/**
	 * Key code to user order.
	 *
	 * @param keyCode the key code
	 * @return the user order
	 */
	private UserOrder keyCodeToUserOrder(final int keyCode) {
		UserOrder UserOrder = null;
		switch (keyCode) {
			case KeyEvent.VK_RIGHT:
				UserOrder = UserOrder.RIGHT;
				refresh();
				break;
			case KeyEvent.VK_LEFT:
				UserOrder = UserOrder.LEFT;
				refresh();
				break;
			case KeyEvent.VK_DOWN:
				UserOrder = UserOrder.DOWN;
				refresh();
				break;
			case KeyEvent.VK_UP:
				UserOrder = UserOrder.UP;
				refresh();
				break;
			default:
				UserOrder = UserOrder.NOP;
				refresh();
				break;
		}
		return UserOrder;
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(final KeyEvent keyEvent) {
		// Nop
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public final void keyPressed(final KeyEvent keyEvent) {
		this.getOrderPerformer().orderPerform(keyCodeToControllerOrder(keyEvent.getKeyCode()));
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(final KeyEvent keyEvent) {
		// Nop
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.boulderdash.contract.intview.IView#followMyvehicle()
	 */
	//@Override
	public final void followMyPlayer() {
		this.getCloseView().y = this.getMyPlayer().getY() - this.getMap().getHeight() / 2;
		this.getCloseView().x = this.getMyPlayer().getX() - this.getMap().getHeight() / 2;
	}

	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	private IMap getMap() {
		return this.map;
	}

	/**
	 * Sets the map.
	 *
	 * @param map the new map
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void setMap(final IMap map) throws IOException {
		this.map = map;
		for (int x = 0; x < this.getMap().getWidth(); x++) {
			for (int y = 0; y < this.getMap().getHeight(); y++) {
				this.getMap().getOnTheMapXY(x, y).getSprite().loadImage();
			}
		}
	}

	/**
	 * Gets myPlayer.
	 *
	 * @return myPlayer
	 */
	private IMobile getMyPlayer() {
		return this.myPlayer;
	}

	/**
	 * Sets myPlayer.
	 *
	 * @param myPlayer my new player
	 */
	private void setMyPlayer(final IMobile myPlayer) {
		this.myPlayer = myPlayer;
	}

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	private int getView() {
		return this.view;
	}

	/**
	 * Sets the view.
	 *
	 * @param view the new view
	 */
	private void setView(final int view) {
		this.view = view;
	}

	/**
	 * Gets the close view.
	 *
	 * @return the close view
	 */
	private Rectangle getCloseView() {
		return this.closeView;
	}

	/**
	 * Sets the close view.
	 *
	 * @param closeView the new close view
	 */
	private void setCloseView(final Rectangle closeView) {
		this.closeView = closeView;
	}

	/**
	 * Gets the order performer.
	 *
	 * @return the order performer
	 */
	private IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}

	/**
	 * Sets the order performer.
	 *
	 * @param orderPerformer the new order performer
	 */
	public final void setOrderPerformer(final IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

	@Override
	public void printMessage(String s) {

	}
}
