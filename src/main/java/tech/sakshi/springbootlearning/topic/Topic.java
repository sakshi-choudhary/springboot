package tech.sakshi.springbootlearning.topic;

public class Topic {
    private String id;
    private String name;
    private String desc;

    public Topic(String id, String name, String desc) {
        super();
        this.id=id;
        this.name=name;
        this.desc=desc;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
