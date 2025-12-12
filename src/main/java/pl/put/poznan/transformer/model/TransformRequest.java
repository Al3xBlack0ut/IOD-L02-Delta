package pl.put.poznan.transformer.model;

import java.util.List;

/**
 * Klasa do odebrania jsona z requestu
 * Ma text który chcemy transformować i listę transformacji do zastosowania
 */
public class TransformRequest {
    private int id;
    public int ParentId;
    private float area;
    private float cube;
    private float light;
    private float heating;
    private String name;
    private String type;
    public TransformRequest() {
    }

    public TransformRequest(int id,String name,int ParentId, float area,float cube,float light,float heating,String type) {
        this.id = id;
        this.ParentId = ParentId;
        this.area = area;
        this.cube = cube;
        this.light = light;
        this.heating = heating;
        this.name=name;
        this.type=type;
    }



    public void setId(int id) {
        this.id = id;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setParentId(int ParentId) {
        this.ParentId = ParentId;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public void setCube(float cube) {
        this.cube = cube;
    }
    public void setLight(float light) {
        this.light = light;
    }
    public void setHeating(float heating) {
        this.heating = heating;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public int getParentId() {
        return ParentId;
    }
    public float getArea() {
        return area;
    }
    public float getCube() {
        return cube;
    }
    public float getLight() {
        return light;
    }
    public float getHeating() {
        return heating;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }




    @Override
    public String toString() {
        return "TransformRequest{" +
                "id='" + Integer.toString(id) + '\'' +
                ", transforms=" + name +
                '}';
    }
}
