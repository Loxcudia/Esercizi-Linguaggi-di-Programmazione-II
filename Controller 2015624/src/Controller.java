import java.util.ArrayList;
import java.util.Objects;

public class Controller {
    class Function
    {
        private String name;
        private boolean isOn;
        private List<Function> incompatibleFunctions;
        private Function(String nome)
        {
            this.name = nome;
            this.isOn = false;
            this.incompatibleFunctions = new ArrayList<Function>();
        }
        public boolean getIsOn()
        {
            return this.isOn;
        }
        public String getName()
        {
            return this.name;
        }
        public void turnOn()
        {
            for(Function f : incompatibleFunctions)
            {
                if(f.getIsOn())
                    f.turnOff();
            }
            this.isOn = true;
        }
        public void turnOff()
        {
            this.isOn = false;
        }
        public void setIncompatible(Function x)
        {
            incompatibleFunctions.add(x);
            x.incompatibleFunctions.add(this);
        }
    }

    private ArrayList<Function> functions;


    public Controller()
    {
        functions = new ArrayList<Function>();
    }

    public Function addFunction(String str)
    {
        Function x = new Function(str);
        functions.add(x);
        return x;
    }

    public void printOn()
    {
        System.out.println("Funzionalita' attive:");
        for (Function f: functions)
        {
            if(f.isOn)
                System.out.println(f.name);
        }
    }

}
