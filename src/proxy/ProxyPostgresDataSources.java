package proxy;

public class ProxyPostgresDataSources implements DataSource {

    private final PostgresDataSource postgresDataSource;
    private static final String URL = "localhost:5432/";

    public ProxyPostgresDataSources(PostgresDataSource postgresDataSource) {
        this.postgresDataSource = postgresDataSource;
    }

    @Override
    public String getName() {
        return  "подкоючено " + URL + postgresDataSource.getName();
    }
}
