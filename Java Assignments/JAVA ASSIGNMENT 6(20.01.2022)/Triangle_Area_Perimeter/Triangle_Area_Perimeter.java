package java_area_perimeter;

public class Triangle_Area_Perimeter {

	
		  int a,b,c;
		  public int Area_Triangle(){
		     int a = (b*c)/2;
		     return a;
		     
		    
		  }
		  public int Perimeter_Triangle(){
		    int p= (a+b+c);
		    return p;
		  }



		  public static void main(String[] args){
			Triangle_Area_Perimeter t = new Triangle_Area_Perimeter();
		    t.a = 3;
		    t.b = 4;
		    t.c = 5;
		    System.out.println(t.Area_Triangle());
		    System.out.println(t.Perimeter_Triangle());
		  }
		  }