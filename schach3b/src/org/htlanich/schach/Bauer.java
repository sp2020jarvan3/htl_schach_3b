package org.htlanich.schach;

public class Bauer extends Figur {
	public Bauer(boolean farbeWeiss) {
		super(farbeWeiss, false);
	}
	
	public Bauer(boolean farbeWeiss, boolean bewegt) {
		super(farbeWeiss, bewegt);
		// TODO implement
	}
	
	
	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		int dx= Math.abs(von.x - nach.x);
		int dy= Math.abs(von.y - nach.y);
		
		if  (von.x == nach.x) {
			if(!super.isBewegt()) 
			{
				return(dy == 2);	
			}else 
			{
				return (dy == 1);
			}
				
		}else if ((dx == 1) && (dy == 1)) 		
		{
			Feld f = sp.getFeld(dx, dy);
			if (f instanceof Figur)
			{
				Figur fi = (Figur)f;
				fi.isFarbeWeiss();
				
			}
		} 
			return false;	
	}
//		if( von.x == nach.x)
//		{
//		return(!super.isBewegt() && ((dy== 2)));
//		}else if( von.x == nach.x)
//		{
//		return(super.isBewegt() && (dy==1));
//		}else if( dx==1)
//		{
//		
//			
//		}else
//		{
//			return false;
//		}
//		return false;
//	}
	public String toString()
	{
		return "B" + super.toString();
	}
}
