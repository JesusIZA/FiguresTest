package ua.jrc.figures;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String args[]){
		
		List<String> colors = new ArrayList();
		colors.add("Red");
		colors.add("White");
		colors.add("Black");
		colors.add("Orange");
		colors.add("Yellow");
		
		List<Figure> list = new ArrayList();
		
		//Range 5 to 20
		
		int count = 5 + (int)(Math.random() * 20);
		
		for(int i = 0; i < count; i++){
			int type = 1 + (int)(Math.random() * 4);
			
			if(type == 1){
				int side = 1 + (int)(Math.random() * 10);
				String color = colors.get((int) (Math.random() * 4));
				Square s = new Square(side, color);
				list.add(s);
			} else
				
			if(type == 2){
				int radius = 1 + (int)(Math.random() * 10);
				String color = colors.get((int) (Math.random() * 4));
				Circle c = new Circle(radius, color);
				list.add(c);
			} else
				
			if(type == 3){
				int aSide = 1 + (int)(Math.random() * 10);
				int bSide = 1 + (int)(Math.random() * 10);
				String color = colors.get((int) (Math.random() * 4));
				Triangle tr = new Triangle(aSide, bSide, color);
				list.add(tr);
			}
			
			else {
				int aBasic = 1 + (int)(Math.random() * 10);
				int bBasic = 1 + (int)(Math.random() * 10);
				int h = 1 + (int)(Math.random() * 10);
				String color = colors.get((int) (Math.random() * 4));
				Trapezium s = new Trapezium(aBasic, bBasic, h, color);
				list.add(s);
			}
		}
		
		for(Figure f: list){
			System.out.println(f);
		}
		
	}

}
