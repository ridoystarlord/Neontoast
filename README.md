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
![Neon Info Toast](https://user-images.githubusercontent.com/77241744/138265856-61f26936-9191-4d00-aa7d-ff5b0920e249.png)

> For Success Neon Toast

```
Neontoast.success(yourContext,"Hi Dude", Toast.LENGTH_LONG);
```
![Neon Success Toast](https://user-images.githubusercontent.com/77241744/138266025-c5e59d1e-7490-49f8-9c93-7def97d5bb68.png)

> For error Neon Toast

```
Neontoast.error(yourContext,"Hi Dude", Toast.LENGTH_SHORT);
```
![Neon Error Toast](https://user-images.githubusercontent.com/77241744/138266184-661e4702-36ca-4753-8d3c-a326f8d71fb6.png)

> For warning Neon Toast

```
Neontoast.warning(getApplicationContext(),"Hi Dude", Toast.LENGTH_LONG);
```
![Neon Warning Toast](https://user-images.githubusercontent.com/77241744/138265548-3bc19a83-aafb-4a21-a6a0-bc322e88146e.png)

# Screenshots

![Neon Info Toast](https://user-images.githubusercontent.com/77241744/138265856-61f26936-9191-4d00-aa7d-ff5b0920e249.png)
![Neon Warning Toast](https://user-images.githubusercontent.com/77241744/138265548-3bc19a83-aafb-4a21-a6a0-bc322e88146e.png)
![Neon Success Toast](https://user-images.githubusercontent.com/77241744/138266025-c5e59d1e-7490-49f8-9c93-7def97d5bb68.png)
![Neon Error Toast](https://user-images.githubusercontent.com/77241744/138266184-661e4702-36ca-4753-8d3c-a326f8d71fb6.png)
