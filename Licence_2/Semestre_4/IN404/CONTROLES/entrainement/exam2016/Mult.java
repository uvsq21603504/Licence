public class Mult extends Operateur
{
    public Mult(Calculable opGauche,Calculable opDroite){
        super(opGauche,opDroite);
    }
    
    @Override
    public double evaluate(){
        return opGauche.evaluate()*opDroite.evaluate();
    }
    
    @Override
    public String toString(){
        return ""+super.opGauche+"x"+super.opDroite;
    }
}
