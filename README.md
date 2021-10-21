# NeonToast
 Neon effect Toast library
 
 ## Step 1. Add the JitPack repository to your build.gradle(Project Level)

```
allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
````

## Step 2. Add the dependency to your build.gradle

```
dependencies {
	        implementation 'com.github.ridoystarlord:Neontoast:Tag'
	}
	
````

## Step 3. Usage
> For info Neon Toast

```
Neontoast.info(getApplicationContext(),"Hi Dude", Toast.LENGTH_SHORT);
```
