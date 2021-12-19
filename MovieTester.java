
/**
 * This class calls for the Movie class.
 *
 * @author Ruthie Dignan
 * @version 02/23/21
 */
public class MovieTester
{
    public static void main(String[] args)
    {
        Movie[] movies = new Movie[10];
        Movie[] sorted = new Movie[10];
        
        movies[0] = new Movie("Whiplash", 2014, "Sony Pictures");
        movies[1] = new Movie("La La Land", 2016, "Lionsgate");
        movies[2] = new Movie("The Truman Show", 1998, "Paramount");
        movies[3] = new Movie("Soul", 2020, "Disney");
        movies[4] = new Movie("Ferris Bueller's Day Off", 1986, "Paramount");
        movies[5] = new Movie("Little Shop of Horrors", 1986, "Warner Bros.");
        movies[6] = new Movie("Dead Poets Society", 1989, "Buena Vista Pictures");
        movies[7] = new Movie("It", 2017, "Warner Bros.");
        movies[8] = new Movie("9", 2009, "Focus Features");
        movies[9] = new Movie("Parasite", 2019, "CJ Entertainment");

        System.out.println("    <<<< Before Sorting >>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println(movies[i]);
        
        
            
        //SORTING DATES
        insertionYear(movies, sorted);
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by date in ASCENDING order - passing two arrays >>>>\n");  
        for(int i = 0; i < sorted.length; i++)
            System.out.println(sorted[i] );  
        
        insertionYear2(movies, sorted);
        System.out.println();
        System.out.println("<<<< by date in DESCENDING order - passing two arrays >>>>\n");  
        for(int i = 0; i < sorted.length; i++)
            System.out.println(sorted[i] ); 
            
            
        //SORTING TITLES
        movies = insertionTitle(movies);
        System.out.println();
        System.out.println("<<<< by title in ASCENDING order >>>>\n");
        for(int i = 0; i < movies.length; i++)
            System.out.println(movies[i] ); 
        movies = insertionTitle2(movies);
        System.out.println();
        System.out.println("<<<< by title in DESCENDING order >>>>\n");
        for(int i = 0; i < movies.length; i++)
            System.out.println(movies[i] );     
            
        
        //SORTING STUDIOS
        movies = insertionStudio(movies);
        System.out.println();
        System.out.println("<<<< by studio in ASCENDING order >>>>\n");
        for(int i = 0; i < movies.length; i++)
            System.out.println(movies[i] ); 
        movies = insertionStudio2(movies);
        System.out.println();
        System.out.println("<<<< by studio in DESCENDING order >>>>\n");
        for(int i = 0; i < movies.length; i++)
            System.out.println(movies[i] ); 

        
    }
    
    public static void insertionYear(Movie[] source, Movie[] dest)
    {
        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() > dest[k-1].getYear() )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            
            System.out.println("\nPass # " + i);
            for(Movie h : dest)  
                if( h != null) System.out.printf("%10d \n", h.getYear() );
        } 
    }
    
    public static void insertionYear2(Movie[] source, Movie[] dest)
    {
        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() < dest[k-1].getYear() )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            
            System.out.println("\nPass # " + i);
            for(Movie h : dest)  
                if( h != null) System.out.printf("%10d \n", h.getYear() );
        } 
    }
    
    public static Movie[] insertionTitle(Movie[] source)
    {
        Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo( dest[k-1].getTitle() ) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            
            System.out.println("\nPass # " + i);
            for(Movie h : dest)  
                if( h != null) System.out.printf("%-15s \n", h.getTitle() );
        } 
        return dest;
    }
    
    public static Movie[] insertionTitle2(Movie[] source)
    {
        Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo( dest[k-1].getTitle() ) < 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            
            System.out.println("\nPass # " + i);
            for(Movie h : dest)  
                if( h != null) System.out.printf("%-15s \n", h.getTitle() );
        } 
        return dest;
    }
    
    public static Movie[] insertionStudio(Movie[] source)
    {
        Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getStudio().compareTo( dest[k-1].getStudio() ) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            
            System.out.println("\nPass # " + i);
            for(Movie h : dest)  
                if( h != null) System.out.printf("%-15s \n", h.getStudio() );
        } 
        return dest;
    }
    
    public static Movie[] insertionStudio2(Movie[] source)
    {
        Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getStudio().compareTo( dest[k-1].getStudio() ) < 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            
            System.out.println("\nPass # " + i);
            for(Movie h : dest)  
                if( h != null) System.out.printf("%-15s \n", h.getStudio() );
        } 
        return dest;
    }
}
