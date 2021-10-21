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
Neontoast.info(yourContext,"Hi Dude", Toast.LENGTH_SHORT);
```

> For Success Neon Toast

```
Neontoast.success(yourContext,"Hi Dude", Toast.LENGTH_LONG);
```

> For error Neon Toast

```
Neontoast.error(yourContext,"Hi Dude", Toast.LENGTH_SHORT);
```

> For warning Neon Toast

```
Neontoast.warning(getApplicationContext(),"Hi Dude", Toast.LENGTH_LONG);

![Screenshot_133](https://user-images.githubusercontent.com/77241744/138265548-3bc19a83-aafb-4a21-a6a0-bc322e88146e.png)
```


# Screenshots

![Screenshot_133](https://user-images.githubusercontent.com/77241744/138265548-3bc19a83-aafb-4a21-a6a0-bc322e88146e.png)
