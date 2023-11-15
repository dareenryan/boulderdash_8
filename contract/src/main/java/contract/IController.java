package contract;

/**
 * The Interface IController.
 *
 * @author Group 8
 */
public interface IController {

	/**
	 * Control.
	 */
	//public void control();

	/**
	 * Play.
	 */
	void play() throws InterruptedException;

	/**
	 * Gets the order performer.
	 *
	 * @return the order performer
	 */
	IOrderPerformer getOrderPerformer();
}
