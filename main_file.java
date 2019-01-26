public class main_file
{
    public static void main (String args[])
    {
        dog dog1;
        dog1 = new dog();

        dog1.nickname   = "wolf";
        dog1.breed      = "spaniel";
        dog1.speed      = 50;

        dog1.run();
        System.out.println(dog1.dog_info());
    }
}
