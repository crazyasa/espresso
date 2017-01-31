//(10)
//10\r\n18\r\n16\r\n14\r\n8\r\n9\r\n61\r\n2\r\n1\r\n0\r\n6\r\n
//Please enter the number of elements you wish to sort: Enter element number 0: Enter element number 1: Enter element number 2: Enter element number 3: Enter element number 4: Enter element number 5: Enter element number 6: Enter element number 7: Enter element number 8: Enter element number 9: 0
//1
//2
//6
//8
//9
//14
//16         
//18
//61
class Io {
    static public void print(byte b) { }
    static public void print(short s) { }
    static public void print(char c) { }
    static public void print(int i) { }
    static public void print(long l) { }
    static public void print(float f) { }
    static public void print(double d){ }
    static public void print(String s){ }
    static public void print(boolean b){ }
    static public void println(byte b) { }
    static public void println(short s){ }
    static public void println(char c) { }
    static public void println(int i) { }
    static public void println(long l) { }
    static public void println(float f){ }
    static public void println(double d){ }
    static public void println(String s){ }
    static public void println(boolean b){ }

    static public int readInt() { }
    static public long readLong() { }
    static public float readFloat() { }
    static public double readDouble() { }
    static public String readString() { }
}

class Tree {
    int value;
    Tree left, right;
    Tree() {}
    Tree(int value) {
	this.value = value;
	left = right = null;
    }

    Tree insert(int value) {
	if (this.value < value) {
	    if (right == null) 
		right = new Tree(value);
	    else
		right = right.insert(value);
	} else if (this.value > value) {
	    if (left == null) 
		left = new Tree(value);
	    else
		left = left.insert(value);
	}
	return this;
    }

    void traverse() {
	if (left != null)
	    left.traverse();
	Io.println(value);
	if (right != null)
	    right.traverse();
    }
}

class Main {
    public static void main() {
	int no,temp;
	Tree t = null;
	Io.print("Please enter the number of elements you wish to sort: ");
	no = Io.readInt();
	
	for (int i=0;i<no;i++) {
	    Io.print("Enter element number ");
	    Io.print(i);
	    Io.print(": ");
	    temp = Io.readInt();
	    if (t == null) 
		t = new Tree(temp);
	    else
		t = t.insert(temp);
	}
	t.traverse();
    }
}
