package 김준연;

public class BitOperation {
	public static void main(String[] args)
	{
		byte x=(byte)0x00,y=(byte)0xFF;
		byte z;
		z=(byte)(x&y);
		System.out.println("& : "+z);
		z=(byte)(x|y);
		System.out.println("| : "+Byte.toUnsignedInt(z));
		z=(byte)(x^y);
		System.out.println("^ : "+Byte.toUnsignedInt(z));
		z=(byte)~y;
		System.out.println("~ : "+z);
	}
}
