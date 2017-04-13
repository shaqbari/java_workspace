package api;

class UseWrapper{
	public static void main(String [] args){
		Integer i=new Integer("3");
		/*i=5; 기본자료형을 객체자료형으로 받았으므로 
		unBoxing이라고 한다. Wrapper class에대해서만 가능*/

		int x=3;
		x=i; /*가능 boxing이라고한다.
		기본자료형-->객체자료형*/
	}
}
