package controller;

import contract.*;

/**
 * The Class Controller.
 *
 * @author Group 8
 * @see IOrderPerformer
 */
public class Controller implements IController, IOrderPerformer {

	/** The Constant speed. */
	private static final int speed = 300;

	/** The view. */
	private IView		view;

	/** The model. */
	private IBoulderDashModel	model;

	/** The stack order. */
	private UserOrder stackOrder;

	/**
	 * Instantiates a new boulder dash controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IBoulderDashModel model) {
		this.setView(view);
		this.setModel(model);
		this.clearStackOrder();
	}

	/**
     * play.
     */
	@Override
	public final void play() throws InterruptedException {
		while (this.getModel().getMyHero().isAlive()){
			Thread.sleep(speed);
			switch (this.getStackOrder()) {
				case RIGHT:
					this.getModel().getMyHero().moveRight();
					break;
				case LEFT:
					this.getModel().getMyHero().moveLeft();
				case UP:
					this.getModel().getMyHero().moveUp();
				case DOWN:
					this.getModel().getMyHero().moveDown();
				case NOP:
				default:
					this.getModel().getMyHero().doNothing();
					break;
			}
			this.clearStackOrder();
			if (this.getModel().getMyHero().isAlive()) {
				this.getModel().getMyHero().moveDown();
			}
			this.getView().followMyPlayer();
		}
		this.getView().printMessage("DEAD!!!");
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	/*public void control() {
		this.view.printMessage("Appuyer sur les touches 'E', 'F', 'D' ou 'I', pour afficher Hello world dans la langue d votre choix.");
	}*/

	@Override
	public final void orderPerform(final UserOrder userOrder){
		this.setStackOrder(userOrder);
	}

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	private IView getView() {
		return this.view;
	}

	/**
     * Sets the view.
     *
     * @param view
     *            the new view
     */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	private IBoulderDashModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IBoulderDashModel model) {
		this.model = model;
	}

	/**
     * Gets the stack order.
     *
     * @return the stack order
     */
	private UserOrder getStackOrder(){
		return this.stackOrder;
	}

	/**
	 * Sets the stack order.
	 *
	 * @param stackOrder
	 *            the new stack order
	 */
	private void setStackOrder(final UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}

	/**
	 * Clear stack order.
	 */
	private void clearStackOrder() {
		this.stackOrder = UserOrder.NOP;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */

	@Override
	public IOrderPerformer getOrderPerformer(){
		return this;
	}

	/*public void orderPerform(final UserOrder userOrder) {
		switch (userOrder) {
			case English:
				this.model.loadHelloWorld("GB");
				break;
			case Francais:
				this.model.loadHelloWorld("FR");
				break;
			case Deutsch:
				this.model.loadHelloWorld("DE");
				break;
			case Indonesia:
				this.model.loadHelloWorld("ID");
				break;
			default:
				break;
		}
	}*/

}
