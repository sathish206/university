package org.univ;

public class College extends University{
public void ug() {System.out.println("B.E");
	
}
public void pg() {System.out.println("M.Tech");
	
}
public static void main(String[] args) {
	University u=new University();
	u.ug();
	u.pg();
	College c=new College();
	c.ug();
	c.pg();
}
}
//branching