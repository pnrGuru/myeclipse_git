package interfaces;

interface Rollable {
	boolean roll();

}
interface Visible extends Rollable{
	
	default boolean A() {
		return true;
	}
	
}
