package designpatterns.delegation.loggingexample

//Errors will be resolved in the Android environment

/*
class MockActivity : AppCompatActivity(),
    AnalyticsLogger by AnalyticsLoggerImpl(),
    Loader by LoaderImpl()

{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registerLifecycleOwner(this) //belongs to testing
        openLoader(this)
        dismissLogger()
    }
}*/
