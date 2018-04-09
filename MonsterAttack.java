import java.util.Random;
import java.util.Scanner;

public class MonsterAttack {
    public static void main(String[] args) {
        Scanner fight = new Scanner(System.in);

        //Monster character
        System.out.println("Attack points of Monster");
        int monsterAttack = fight.nextInt();
        System.out.println("Monster Defense points");
        int monsterDefense = fight.nextInt();
        System.out.println("Monster Damage");
        int monsterDamage = fight.nextInt();
        System.out.println("monster Life Points");
        int monsterLife = fight.nextInt();


        //Hero's Attributes
        System.out.println("godZilla Attack points");
        int zillaAttack = fight.nextInt();
        System.out.println("godZilla Defense Points");
        int zillaDefense = fight.nextInt();
        System.out.println("godZilla Damage");
        int zillaDamage = fight.nextInt();
        System.out.println("godZilla Life Points");
        int zillaLife = fight.nextInt();

        //Generete a trandom attacker
        Random generetor = new Random();
        boolean attacker = generetor.nextBoolean();

        if(attacker){
            System.out.println("godZilla Attack");
            int dice = generetor.nextInt(6) + 1 + generetor.nextInt(6)+1;
            int attackValue = zillaAttack + dice;
            System.out.println("Rolled value = " + dice);
            System.out.println("Attack  value = " + attackValue);
            if(attackValue > monsterDefense){
                System.out.println("godZilla Attack succsfull!!");
                monsterLife = monsterLife - zillaDamage;
                System.out.println("Monster's Life after attack = " + monsterLife);
            }else{
                System.out.println("godZilla attack was unsuccesful");
            }
        }else {
            System.out.println("Monster Attack");
            int dice = generetor.nextInt(6) + 1 + generetor.nextInt(6)+1;
            int attackValue = monsterAttack + dice;
            System.out.println("Rolled value = " + dice);
            System.out.println("Attack  value = " + attackValue);
            if(attackValue > zillaDefense){
                System.out.println("Monster Attack succsfull!!");
                zillaLife -= monsterDamage;
                System.out.println("godZilla's Life after attack = " + zillaLife);
            }else{
                System.out.println("Monster attack was unsuccesful");
            }
        }





    }






}
