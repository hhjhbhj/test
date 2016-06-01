<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
  <title>Home</title>
</head>
<body>
<h1>${message}</h1>
<h2>Again!</h2>


<div><fmt:message key="data.horizon.dw.model"/></div>


<table id="tab" cellpadding="1" cellspacing="1" border="1">
  <tr>
    <th rowspan="2">序号</th>
    <th colspan="2">王五</th>
    <th colspan="2">李四</th>
    <th colspan="2">孙传</th>
    <th colspan="2">胡平</th>
    <th rowspan="2">合计</th>
  </tr>
  <tr>
    <th>语文</th>
    <th>数学</th>
    <th>语文</th>
    <th>数学</th>
    <th>语文</th>
    <th>数学</th>
    <th>语文</th>
    <th>数学</th>
  </tr>
  <tr>
    <th>1</th>
    <th>78</th>
    <th>96</th>
    <th>67</th>
    <th>98</th>
    <th>88</th>
    <th>75</th>
    <th>94</th>
    <th>69</th>
    <th></th>
  </tr>
  <tr>
    <th>2</th>
    <th>89</th>
    <th>68</th>
    <th>77</th>
    <th>87</th>
    <th>84</th>
    <th>76</th>
    <th>71</th>
    <th>87</th>
    <th></th>
  </tr>
  <tr>
    <th>3</th>
    <th>75</th>
    <th>78</th>
    <th>89</th>
    <th>74</th>
    <th>65</th>
    <th>68</th>
    <th>98</th>
    <th>90</th>
    <th></th>
  </tr>
  <tr>
    <th>4</th>
    <th>79</th>
    <th>89</th>
    <th>65</th>
    <th>62</th>
    <th>64</th>
    <th>87</th>
    <th>97</th>
    <th>91</th>
    <th></th>
  </tr>
  <tr>
    <th>5</th>
    <th>89</th>
    <th>96</th>
    <th>67</th>
    <th>76</th>
    <th>74</th>
    <th>84</th>
    <th>67</th>
    <th>81</th>
    <th></th>
  </tr>
  <tr>
    <th>6</th>
    <th>94</th>
    <th>90</th>
    <th>97</th>
    <th>74</th>
    <th>62</th>
    <th>81</th>
    <th>78</th>
    <th>78</th>
    <th></th>
  </tr>
  <tr>
    <th>7</th>
    <th>78</th>
    <th>89</th>
    <th>77</th>
    <th>87</th>
    <th>45</th>
    <th>86</th>
    <th>77</th>
    <th>98</th>
    <th></th>
  </tr>
  <tr>
    <th>8</th>
    <th>65</th>
    <th>67</th>
    <th>94</th>
    <th>68</th>
    <th>87</th>
    <th>69</th>
    <th>78</th>
    <th>68</th>
    <th></th>
  </tr>
  <tr>
    <th>9</th>
    <th>86</th>
    <th>98</th>
    <th>87</th>
    <th>87</th>
    <th>65</th>
    <th>78</th>
    <th>98</th>
    <th>79</th>
    <th></th>
  </tr>
  <tr>
    <th>10</th>
    <th>88</th>
    <th>75</th>
    <th>77</th>
    <th>97</th>
    <th>97</th>
    <th>77</th>
    <th>70</th>
    <th>87</th>
    <th></th>
  </tr>
</table>

<button onclick="alert('thankyou')"> click</button>




<script type="text/javascript">
  var book = {author: "tt", name: "me"};
  o = {x:1, y:{z:[false,null,""]}};
  s = JSON.stringify(0);



</script>


</body>
</html>
