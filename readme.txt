使用 Drawerlayout实现侧滑效果的代码很简单。
第1步：在xml布局的布局中，使用android.support.v4.widget.DrawerLayout控件作为一个xml文件的根节点
第2步：必须有两个layout，一个用于默认的布局，一个用于侧侧滑
第3步：用于侧滑的Layout，加入android:layout_gravity="start|end"属性（从左侧/右侧进入，默认覆盖在主页面的上面）
第4步：Activity中打开或者隐藏侧滑菜单：
       drawerLayout.openDrawer(GravityCompat.START);
       drawerLayout.closeDrawer(Gravity.LEFT);
       
项目中还使用到的  Butterknife 注解的方法。在ButtonKnife的最新库中，注解的方式从
     @Inject(id)
换成了
     @Bind(id)
