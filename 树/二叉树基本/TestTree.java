package Tree;

public class TestTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String prestr="ABDGCEFH";
         String instr="DGBAECHF";
         Tree tree1=new Tree(prestr,instr);
         //tree1.postTravel();
         /*tree1.preTraval();
         tree1.inTravel();
         tree1.postTravel();
         tree1.unnormalTravel();*/
         tree1.layerTravel();
         
	}

}
