package _01_Custom_ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	private T[] array; 
	public ArrayList() {
		this.array = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {

		if((loc<array.length) && (loc>=0))
		{
			return array[loc];
		}
		else 
		{
			throw new IndexOutOfBoundsException("Index out of bounds " + loc);
		}
	}
	
	public void add(T val) {
		T[] tempArray = (T[]) new Object[array.length + 1];
		if (array.length > 0) 
		{
			for (int i = 0; i < array.length; i++) 
			{
				tempArray[i] = array[i];
			}
		}
		tempArray[array.length] = val;
		array = tempArray;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if((loc<array.length) && (loc>=0))
		{
			T[] tempArray = (T[]) new Object[array.length+1];
			for(int i = 0; i<loc; i++)
			{
				tempArray[i] = array[i];
			}
			tempArray[loc] = val;
			for(int i = loc; i<array.length; i++)
			{
				tempArray[i+1] = array[i];
			}
			array=tempArray;
		}
		else 
		{
			throw new IndexOutOfBoundsException("Index out of bounds " + loc);
		}
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if((loc<array.length) && (loc>=0))
		{
			array[loc] = val;
		}
		else 
		{
			throw new IndexOutOfBoundsException("Index out of bounds " + loc);
		}
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		if((loc<array.length) && (loc>=0))
		{
			T[] tempArray = (T[]) new Object[array.length-1];
			for(int i = 0; i<loc; i++)
			{
				tempArray[i] = array[i];
			}
			
			for(int i = loc+1; i<array.length; i++)
			{
				tempArray[i-1] = array[i];
			}
			array = tempArray;
		}
		else 
		{
			throw new IndexOutOfBoundsException("Index out of bounds " + loc);
		}
		
	}
	
	public boolean contains(T val) {
		for(int i = 0; i< array.length; i++)
		{
			if(array[i].equals(val))
				return true;
		}
		return false;
	}
	
	public int size()
	{
		return array.length;
	}
}