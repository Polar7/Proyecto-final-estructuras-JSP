package sos.sisho.myFirstServlet.todo.domain;

public class Todo {

    private String name;
    private String uuid;

    public Todo(String uuid, String name ) {
        this.name = name;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "name='" + name + '\'' +
                '}';
    }
}
