import java.util.EnumSet;

public class EnumSetConcepts {

	//its not synchronized
	//its a highly performance java collection member
	//faster than HashSet
	//all the methods are implemented using bitwise arithmetic operations.
	
	enum Lang{
		
		JAVA,
		CSHARP,
		JAVASCRIPT,
		PYTHON,
		RUBY
		
	}
	
	
	public static void main(String[] args) {
		
		// created a new enumset using enum
		EnumSet<Lang> langs  = EnumSet.allOf(Lang.class);
		System.out.println(langs);
		
		langs.forEach((k) -> System.out.println(k));
		
		// empty enum set:
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);
		
		//range(e1,e2);
		
		EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA, Lang.JAVASCRIPT);
		System.out.println(enumRange);
		
		//of:
		EnumSet<Lang> CSharpEnum = EnumSet.of(Lang.CSHARP);
		
		System.out.println(CSharpEnum);
		
		EnumSet<Lang> multipleEnum = EnumSet.of(Lang.JAVA, Lang.RUBY);
		System.out.println(multipleEnum);
		
		//add and addAll();
		
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		lang2.add(Lang.JAVASCRIPT);
		lang2.addAll(lang1);
		System.out.println(lang2);
		
		
		
		

	}

}
