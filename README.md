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
Neontoast.success(yourContext,"Hi Dude", Toast.LENGTH_SHORT);
```

> For error Neon Toast

```
Neontoast.error(yourContext,"Hi Dude", Toast.LENGTH_SHORT);
```

> For warning Neon Toast

```
Neontoast.warning(yourContext,"Hi Dude", Toast.LENGTH_SHORT);
```

# Screenshots
![Test](https://emperorempire.com/wp-content/uploads/2020/09/Free-Sync-vs-G-Sync-feature.png)
