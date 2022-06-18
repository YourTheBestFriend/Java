/*

 Инструменты
 <PowerTools>
    <model> Name </model>
    <Handy> одно- или двуручное </Handy>
    <Origin> Страна Производитель</Origin>
    <TS>
        <UseEnergy> (низкое, среднее, высокое </UseEnergy>
        <Perfomance> Ten </Perfomance>
    </TS>
    <material>    </material>
 </PowerTools>

* */

public class PowerTools {
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHandy() {
        return handy;
    }

    public void setHandy(String handy) {
        this.handy = handy;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUseEnergy() {
        return UseEnergy;
    }

    public void setUseEnergy(String useEnergy) {
        UseEnergy = useEnergy;
    }

    public String getPerfomance() {
        return Perfomance;
    }

    public void setPerfomance(String perfomance) {
        Perfomance = perfomance;
    }

    private String model;
    private String handy;
    private String origin;
    private String UseEnergy;
    private String Perfomance;

    public PowerTools() {
    }

    public PowerTools(String model, String handy, String origin, String UseEnergy, String Perfomance) {
       this.model = model;
       this.handy = handy;
       this.origin = origin;
       this.UseEnergy = UseEnergy;
       this.Perfomance = Perfomance;
    }
}
