其实Drawerlayout实现侧滑效果的代码很简单。
第1步：在xml布局的跟布局中，使用android.support.v4.widget.DrawerLayout控件
第2步：必须有两个layout，一个用于默认的布局，一个用于侧侧滑
第3步：用于侧滑的Layout，加入android:layout_gravity="start|end"属性
第4步：Activity中打开或者隐藏侧滑菜单：
      drawerLayout.openDrawer(GravityCompat.START);
	  drawerLayout.closeDrawer(Gravity.LEFT);