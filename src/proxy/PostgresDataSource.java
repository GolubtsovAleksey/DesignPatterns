package proxy;

public class PostgresDataSource implements DataSource {

    private static final String name = "postgres";

    public String getName() {
        return name;
    }
}
