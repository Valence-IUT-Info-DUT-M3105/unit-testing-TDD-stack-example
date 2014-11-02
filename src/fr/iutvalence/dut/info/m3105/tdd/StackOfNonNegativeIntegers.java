package fr.iutvalence.dut.info.m3105.tdd;

public class StackOfNonNegativeIntegers
{
	public static final int DEFAULT_CAPACITY = 10;
	
	private final int capacity;

	private int size;
	
	private int topOfStack;

	public StackOfNonNegativeIntegers()
	{
		this.capacity = DEFAULT_CAPACITY;
		this.size = 0;
	}
	
	public StackOfNonNegativeIntegers(int capacity)
	{
		this.capacity = capacity;
		this.size = 0;
	}
	
	public int getSize()
	{
		return this.size;
	}

	public int getCapacity()
	{
		return this.capacity;
	}

	public int pop() throws EmptyStackException
	{
		if (this.size == 0) 
			throw new EmptyStackException();
		
		decrementSize();
		return this.topOfStack;
	}

	private void decrementSize()
	{
		this.size -= 1;		
	}

	public int view() throws EmptyStackException
	{
		if (this.size == 0) 
			throw new EmptyStackException();
		
		return this.topOfStack;
	}

	public void push(int element) throws NegativeIntegerException
	{
		raiseExceptionIfElementIsNegative(element);
		
		this.topOfStack = element;
		incrementSize();
	}

	private void incrementSize()
	{
		this.size += 1;
	}

	private void raiseExceptionIfElementIsNegative(int element) throws NegativeIntegerException
	{
		if (element < 0)
			throw new NegativeIntegerException();
	}
}
