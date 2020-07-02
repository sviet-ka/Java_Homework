
public class HasNestedClass 
	implements HasNested, HasNested.Nested
{
	@Override
	public void outerMethod()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void innerMethd()
	{
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) 
	{
		HasNested.Nested object = new HasNestedClass();
		object.innerMethd();
		
	}
}
