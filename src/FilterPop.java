
public class FilterPop implements GenreFilterInterface{
  @Override
  //Filters only pop
  
  public boolean permit(Album a){
	  
    return a.genre().equals("Pop");
    
  }
  
}