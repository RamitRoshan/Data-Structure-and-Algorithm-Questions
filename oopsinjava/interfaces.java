package oopsinjava;

public class interfaces {
    public static void main(String[] args) {
        Queen q  = new Queen();
        q.moves();
//        Bear b = new Bear();
//        b.eatmeat();
    }
}

//interface Herbivore{
// void eatPlant();
//}
//interface Carnivore{
// void eatmeat();
//}
//class Bear implements Herbivore , Carnivore{
// public void eatPlant(){
//     System.out.println("eats plant ");
// }
// public void eatmeat(){
//     System.out.println("eats meat");
//    }
//}

        interface cheesePlayer { //blueprint how cheeseplayer looks
            void moves(); //this function(moves) is by defualt public and abstract
        }

        class Queen implements cheesePlayer{
            public void moves(){
                /*we have to write this public keyword
                ,because if by default we dont write
                any keywords then this moves fn will become default type
                 */
                System.out.println("up, down, left,right, diagonal(in all 4 direction)");
            }
        }
        class Rook implements cheesePlayer{
            public void moves(){
                System.out.println("up, down, left, right");
            }
        }
class King implements cheesePlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(by 1-steps)");
    }
}
