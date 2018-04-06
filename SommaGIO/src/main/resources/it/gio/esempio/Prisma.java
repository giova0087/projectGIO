package it.gio.esempio;

public class Prisma {
 
		protected Poligono base;   
		protected double altezza;
		public Prisma(Poligono b, double h){  
			base = b;
			altezza = h;
		}
		public double volume(){   
			return base.area() * altezza;
		}
		public double superficieLaterale(){  
			return base.perimetro() * altezza;
		}
		public double superficieTotale(){  
			return base.area() * 2 + this.superficieLaterale();
		}
	}

}
