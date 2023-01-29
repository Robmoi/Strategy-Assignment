
public class FilterNoPop implements GenreFilterInterface{
	
	//Filters all genre but pop
	
  @Override
  
  public boolean permit(Album a){
    return !a.genre().equals("Pop");
  
  }
  
}