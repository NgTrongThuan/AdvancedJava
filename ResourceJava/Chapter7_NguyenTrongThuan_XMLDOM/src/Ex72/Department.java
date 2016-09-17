
package Ex72;

/**
 *
 * @author Nguyen Trong Thuan
 * @since : 17/09/2016
 * @version: 1.0
 * create class Department
 */
public class Department {

    private String id;
    private String name;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // show information of department
    public void showInfo() {
        System.out.println("id " + id);
        System.out.println("name " + name);
        System.out.println("");
    }

}
