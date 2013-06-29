package com.seroperson.generator;

import java.util.ArrayList;
import java.util.List;

public class Cell { 
	
	private int x = 0;
	private boolean right;
	private boolean down;
	private List<Cell> set;
		
	public Cell(int x) {  
		this.right = false;
		this.down = false;
		this.x = x;
	}
		
	public int getX() { 
		return x;
	}
								
	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isDown() {
		return down;
	}
		
	public void setDown(boolean down) {
		this.down = down;
	}
		
		public List<Cell> getSet() { 
			return set;
		}
		
		public void setSet(List<Cell> set) { 
			this.set = set;
		}
		
		public static int isSetContainsDowns(List<Cell> set) {  
			int count = 0;
			for(Cell cell : set)
				if(cell.isDown())
					count++;
			return count;					
		}
		
		public static int isContainsInSet(List<Cell> set, Cell ccell) { 
			int count = 0;
			for(Cell cell : set) {
				if(cell.getX() == ccell.getX())
					return count;
				count++;
			}
			return -1;
		}
		
		public static void queryCallback(Callback cb, Cell[] row) {  
			List<List<Cell>> sets = new ArrayList<List<Cell>>();
			for(Cell cell : row) {
				boolean add = true;
				for(List<Cell> set : sets) SetsWhile: {
					for(Cell inSetCell : set) { 
						if(inSetCell.getX() == cell.getX()) {
							add = false;
							break SetsWhile;
						}
					}
				} 
				if(add)
					sets.add(cell.getSet());
			}
			for(List<Cell> set : sets) 
				cb.action(set);
		}
		
		public void set(Cell other) {  
			this.right = other.right;
			this.down = other.down;
			this.set = new ArrayList<Cell>(other.set);
		}
				
		public String toString() { 
			String down = isDown() ? "_" : " ";
			String right = isRight() ? "|" : " ";
			return new StringBuilder().append(down).append(right).toString();
		}
				
	}