import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			CharStream input = new
			ANTLRFileStream("C:\\Users\\SREE RANJANI\\eclipse-workspace\\q1\\src\\input");
			/* give your filepath in the above place*/
			roll lexer = new roll(input);
			Token token;
			while ((token = lexer.nextToken()).getType()!=-1)
			{
			System.err.println(token.getText());
			}
			} catch(Exception e)
			{
			System.out.println(e);
			}

	}

}
