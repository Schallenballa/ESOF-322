public class Context {
    private dbSoftwareSelection strategy;
    private dbSoftwareSelection defaultStrategy;

    public Context(dbSoftwareSelection strategy){
        this.strategy = strategy;
        this.defaultStrategy = strategy;
    }

    public void executeStrategy(){
        strategy.Store();
    }

	public void setStoreStrategy(dbSoftwareSelection strategy) {
		this.defaultStrategy = strategy;
	}
}