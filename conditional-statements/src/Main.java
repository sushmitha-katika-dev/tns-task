import com.java.conditional.ElseIfCond;
import com.java.conditional.IfElseCond;
import com.java.conditional.Ifcond;
import com.java.conditional.SwitchCond;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ifcond ic = new  Ifcond();
        ic.eligibility();

        IfElseCond ie = new  IfElseCond();
        ie.eligibility();

        ElseIfCond ifc = new  ElseIfCond();
        ifc.calculate();

        SwitchCond sc = new  SwitchCond();
        sc.findDay();
    }
}