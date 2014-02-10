
/**
 * La lampe est caractérisée par sa puissance et son état.
 */
public class Bulb
{
	/**
	 * La puissance par default est 100W.
	 */
	private static final int DEFAULT_POWER = 100 ;  //attributs
	/**
	 * Donne la puissance de la lampe.
	 */
	private final int power ;
	/**
	 * Donne l'état de la lampe (allumer/eteind)
	 */
	private boolean isLit;
	
	/**
	 * Construit la lampe.
	 */
	public Bulb()
	{
		this.power= DEFAULT_POWER; //constructeurs
		this.isLit = false; 
	}
	
	/**
	 * Allume la lampe.
	 */
	public void switchon()
	{
		this.isLit = true;
	}
	
	/**
	 * Eteind la lampe.
	 */
	public void switchoff()
	{	
		this.isLit = false;
	}

}
