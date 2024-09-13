package generics.Game;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    private List<T> participants = new ArrayList<T>();
    public Team(String name) {
        this.name = name;
    }
    public void addParticipant(T p) {
        participants.add(p);
        System.out.println("Into team" + name + " were added new participant" +
                " with name" + p.getName());
    }
    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0){
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println(winnerName + " WIN!");
    }
}
