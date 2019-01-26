public class dog extends main_file {
    String nickname;
    String breed;
    int    speed;

    void run()
    {
        for (int times = 0; times <= speed; times ++)
        {
            String run = "im running";
            System.out.println(run);
        }
    }

    String dog_info()
    {
        return  "My nickname: "  + nickname +
                " My breed: "    + breed +
                " My speed: "    + speed;
    }
}