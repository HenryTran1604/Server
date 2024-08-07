/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.SocketTimeoutException;
import static util.AppConstants.*;

/**
 *
 * @author QuangHuy
 */
public class E1 implements IExercise {

    private final DataInputStream dis;
    private final DataOutputStream dos;

    public E1(DataInputStream dis, DataOutputStream dos) {
        this.dis = dis;
        this.dos = dos;
    }

    @Override
    public int process() {
        try {
            int randNum1 = (int) (Math.random() * 20);
            int randNum2 = (int) (Math.random() * 20);
            int answerSum = randNum1 + randNum2;
            int answerDiff = randNum1 - randNum2;
            int answerMult = randNum1 * randNum2;
            dos.writeInt(randNum1);
            dos.writeInt(randNum2);
            int sum = dis.readInt();
            int diff = dis.readInt();
            int mult = dis.readInt();
            if(sum == answerSum && diff == answerDiff && mult == answerMult ) {
                return ACCEPTED;
            } return WRONG_ANSWER;
        } catch (Exception ex) {
            if(ex instanceof SocketTimeoutException) {
                return TIME_OUT;
            }
            return INVALID_FORMAT_INPUT;
        }
    }

}
