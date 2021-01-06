package codes;

public class Cell {

    private int number; // the solved number in the cell
    private int boxID; // the number of the box the cell is in
    private int potential;
	//public boolean[] possible = new boolean[10];
    boolean[] possible = {true, true, true, true, true, true, true, true, true, true}; //set it all as true
        //this indicates what numbers the cell can possibly be

    public void cantBe(int number)
    {
        possible[number] = false;
    }

    public boolean canBe(int number)
    {
        return possible[number];
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getBoxID() {
        return boxID;
    }
    public void setBoxID(int boxID) {
        this.boxID = boxID;
    }
    public boolean[] getPossible() {
        return possible;
    }
    public void setPossible(boolean[] possible) {
    	
        this.possible = possible;
    }
    
    public int getPotential() {
		return potential;
	}

	public void setPotential(int potential) {
		this.potential = potential;
	}

}




