package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "allcars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    //One-to-One Relationship
    @OneToOne(mappedBy = "car")
    private User user;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
}
