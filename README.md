# PermissionX

注：    
本案例中提交代码到Bintray的方式在AndroidStudio版本更新到4.0+时会报错，不能成功！    

PermissionX是一个用于简化Android运行时权限用法的开源库

添加如下配置将PermissionX引入到你的项目当中：

```groovy
dependencies {
    ...
    implementation 'com.permissionx.chieidev:permissionx:1.0.0'
}
```

然后就可以使用如下语法结构来申请运行时权限了：

```kotlin
PermissionX.request(this, Manifest.permission.CALL_PHONE) { allGranted, deniedList ->
    if (allGranted) {
        Toast.makeText(this, "All permissions are granted", Toast.LENGTH_SHORT).show()
    } else {
        Toast.makeText(this, "You denied $deniedList", Toast.LENGTH_SHORT).show()
    }
}
```