var positionContent;
function transition(a, b) {
	var c, d, e, f, g, h, i;
	if (a.data.simpleData.enable) {
		if (e = a.data.simpleData.idKey, f = a.data.simpleData.pIdKey, g = a.data.key.children, !e || "" == e || !b) return [];
		for (h = [], i = {}, c = 0, d = b.length; d > c; c++) i[b[c][e]] = b[c];
		for (c = 0, d = b.length; d > c; c++) i[b[c][f]] && b[c][e] != b[c][f] ? (i[b[c][f]][g] || (i[b[c][f]][g] = []), i[b[c][f]][g].push(b[c])) : h.push(b[c]);
		return h
	}
	return b
}
function creatOption(a, b, c, d) {
	d += 8, $.each(b, function(b, e) {
		var m, o, p, q, f = e.menuName,
			g = e.menuId,
			h = e.url,
			i = e.target,
			j = e.backgroundPosition,
			k = e.leftIcon,
			x = e.icon ? e.icon:'fa-television',
			y = 'fa-circle-o',
			l = e.map,
			n = e.img;
		if(h==''){
        	h = null;
        }
		 a.data.subMenu ? a.data.tab ? void 0 == h ? (h = "javascript:;", o = $('<li><a href="' + h + '">' + f + "</a></li>")) : o = $('<li><a id="' + g + '" taburl="' + h + '">' + f + "</a></li>") : void 0 == h ? (h = "javascript:;", o = $('<li><a href="' + h + '">' + f + "</a></li>")) : o = $('<li><a id="'+ g +'" onclick="load()" href="' + h + '">' + f + "</a></li>") : a.data.tab ? void 0 == h ? (h = "", o = $('<div><a id="' + g + '" taburl="' + h + '" class="clearfloat"><i class="fa '+ x +'"></i><span>' + f + '</span><b style="display:block;"></b><em></em></a></div>')) : o = $('<div><a id="' + g + '" taburl="' + h + '" class="clearfloat"><i class="fa '+ x +'"></i><span>' + f + "</span><b></b><em></em></a></div>") : void 0 == h ? (h = "javascript:;", o = $('<div><a id="' + g + '" href="' + h + '" class="clearfloat"><i class="fa '+ x +'"></i><span>' + f + '</span><b style="display:block;"></b><em></em></a></div>')) : o = $('<div><a id="'+ g +'" onclick="load()" href="' + h + '" class="clearfloat"><i class="fa '+ y +'"></i><span>' + f + "</span><b></b><em></em></a></div>"), void 0 != i && o.find("a").attr("target", i), a.data.subMenu ? (0 != e.parentId && (p = $('<li><a href="javascript:;"><i style="background-position:' + j + '"></i><span>' + f + "</span></a></li>"), $(".header_menu").append(p), p.click(function() {
			 var a = $(this).index();
			$(this).find("a").addClass("active").parent("li").siblings("li").find("a").removeClass("active"), $(".menu_content ul").eq(a).show().siblings("ul").hide()
		}), m = $("<ul class='menuContent'></ul>"), $(".menu_content").append(m)), void 0 == c || "menuContent" == c.attr("class") && (c.append(o), o.find("a").click(function() {
			$(this).addClass("active").parent("li").siblings("li").find("a").removeClass("active"), positionContent = $(".header_menu").find("a.active span").text() + " / " + $(this).text(), "" != $(this).attr("taburl") && a.data.tab && document.getElementById("frmright").contentWindow.tabAddHandler("tab_" + $(this).attr("id"), $(this).text(), $(this).attr("taburl"))
		})), e.children && (q = e.children, creatOption(a, q, m, d)), $(".header_menu li").eq(0).find("a").addClass("active"), $(".menu_content ul").eq(0).show()) : a.data.topMenu ? (0 == e.parentId ? ("top" == a.data.iconPos ? p = $('<div class="nav_icon_h_item"><a ><div class="nav_icon_h_item_img"><img src="' + e.img + '"></div><div class="nav_icon_h_item_text">' + f + "</div></a></div>") : (p = $('<li><a id="'+ g +'" href="javascript:;"><span>' + f + "</span></a></li>"), $(".header_menu").append(p), p.click(function() {
			if(typeof(e.children) != "undefined"){
				$("#hideCon").show();
				var b = $(this).index();
				$(this).find("a").addClass("active").parent("li").siblings("li").find("a").removeClass("active"), $(".stair_win .menuContent").eq(b).show().siblings(".menuContent").hide(), a.data.map && ($(this).attr("map") ? (switchMenu(0), $(".LeftNav_title").hide()) : ($(".map_content").hide().stop().animate({
					width: "0px"
				}), switchMenu(1), $(".LeftNav_title").show()));
				try {
					top.bottomHide(), $(".map_content,map_list_content").hide()
				} catch (c) {}
			}else{
				$("#hideCon").hide();
				$(this).find("a").addClass("active").parent("li").siblings("li").find("a").removeClass("active");
			}
		}), m = $("<ul class='menuContent'></ul>"), $(".menu_content").append(m), $(".header_menu li").eq(0).find("span").click()), l && p.attr("map", l), h && p.find("a").attr("href", h), void 0 != i && p.find("a").attr("target", i), b < a.data.maxNum ? $(".nav_icon_h").append(p) : (b == a.data.maxNum && $(".nav_icon_h").append($('<div class="nav_more"><div class="nav_more_content"></div></div>')), $(".nav_icon_h .nav_more_content").append(p)), $(".nav_icon_h .nav_icon_h_item").eq(0).find("a").addClass("current"), $(".nav_icon_h_item").click(function() {
			var a = $(this).index();
			$(".stair_win .menuContent").eq(a).show().siblings(".menuContent").hide(), $(this).parents(".nav_icon_h").find("a").removeClass("current"), $(this).find("a").addClass("current"), $(this).attr("map") && $(".map_content").stop().show()
		}), m = $("<div class='menuContent'></div>"), $(".stair_win").append(m)) : "menuContent" == c.attr("class") ? (o.addClass("style1"), o.find(">a").click(function() {
			if (a.data.topMenu && $(".header_menu a.active").parent("li").attr("map")) {
				$(".map_content").show().stop().animate({
					width: "250px"
				}, 100);
				try {
					top.bottomHide()
				} catch (b) {}
			}
			$(".stair_win .menuContent a").removeClass("active"), $(this).addClass("active")
		}), c.append(o), m = $("<div class='childContent'></div>"), o.append(m)) : (o.addClass("style2"), "javascript:;" != o.find(">a").attr("href") && o.find(">a").click(function() {
			$(".stair_win .menuContent .style1 a").removeClass("active"), $(this).parents(".style1").find(">a").addClass("active")
		}), c.append(o), m = o, o.find("a i").css("marginLeft", d)), e.children ? (q = e.children, creatOption(a, q, m, d), o.find("a").click(function() {
			o.find("a em").remove()
		})) : (o.find("a b").remove(), o.find(".childContent").remove(), o.find("a").click(function() {
			positionContent = $(".header_menu").find("a.active span").text() + " / " + $(this).find("span").text(), $(".style1 a").removeClass("hover"), $(this).addClass("hover"), o.find("a em").remove(), "" != $(this).attr("taburl") && a.data.tab && document.getElementById("frmright").contentWindow.tabAddHandler("tab_" + $(this).attr("id"), $(this).text(), $(this).attr("taburl"))
		}))) : ("stair_win" == c.attr("class") ? (a.data.leftIcon ? o.addClass("style1").find("a").attr("href", "javascript:;").addClass("bigNav").prepend('<img src="' + n + '" />').find("i").hide() : o.addClass("style1"), l && o.attr("map", l), c.append(o), m = $("<div class='childContent'></div>"), o.append(m)) : (o.addClass("style2"), "stair_win" == c.parent().attr("class") ? c.find(".childContent").append(o) : c.append(o), o.find("a i").css("marginLeft", d)), e.children ? (q = e.children, m = o, creatOption(a, q, m, d)) : (o.find("a b").css("display", "none"), o.find(".childContent").remove(), o.parents(".style1").addClass("mapshow"), o.find("a").hover(function() {
			$(this).find("em").show()
		}, function() {
			$(this).find("em").hide()
		}), o.find("a").click(function() {
			positionContent = $(this).parents(".style1").find(">a span").text() + " / " + $(this).find("span").text();
			if ($(".style1 a").removeClass("hover"), $(".style1 a").removeClass("active"), $(this).addClass("hover").parents(".style1").find(">a").addClass("active"), "" != $(this).attr("taburl") && a.data.tab && document.getElementById("frmright").contentWindow.tabAddHandler("tab_" + $(this).attr("id"), $(this).text(), $(this).attr("taburl")), $(this).parents(".style1").attr("map")) {
				$(".map_content").stop().show(), $(this).parents(".style1").hasClass("mapshow") || ($("#frmright").attr("src", $("#hbox .home").attr("href")), $(this).parents(".style1").addClass("mapshow"));
				try {
					top.bottomHide()
				} catch (b) {}
			} else {
				$(".map_content").stop().hide();
				try {
					top.bottomHide()
				} catch (b) {}
				$(this).parents(".style1").siblings(".mapshow").removeClass("mapshow")
			}
		}))), a.data.lefticonTab && ($("#bs_left").addClass("lefticontabContent"), $(".stair_win .style1").eq(0).find(">a").addClass("active").next(".childContent").show())
	});
}
function switchMenu(a) {
	var b, c, d, f, g;
	if (setting.data.minWidth && (minWidth = setting.data.minWidth), a) {
		if (b = $(".menu_collapse .stair_win .menuContent"), b.find(".style1>a").removeAttr("title"), b.find(".style1>a").hideTip(), $("#bs_left").stop().animate({
			width: old_width
		}, 200), $(".LeftNav_title").animate({
			marginLeft: "0px"
		}, 200).find("b").removeClass("active"), show_on = 0, click_off = 1, $(".LeftNav_win").css("overflow", "auto"), $(".stair_win .style1").css("position", "static"), $(".stair_win .style1 a b").removeClass("rotate"), $("#lbox").removeClass("menu_collapse"), setting.data.lefticonTab) for ($(".stair_win .style1"), f = $(".stair_win .style2"), $(".stair_win .style1").eq(0).find(">a").addClass("active").next(".childContent").show(), c = 0; c < f.length; c++) f.eq(c).find(">a").hasClass("hover") && (g = f.eq(c).parents(".style1").index(), $(".stair_win .style1>a").removeClass("active"), $(".stair_win .style1").eq(g).find(">a").addClass("active").next(".childContent").show())
	} else {
		for (0 == setting.data.animate ? $("#bs_left").stop().animate({
			width: minWidth + "px"
		}, 10) : $("#bs_left").stop().animate({
			width: minWidth + "px"
		}, 200), $(".stair_win .menuContent").find(".style1 .childContent").stop().slideUp(50), $(".stair_win").find(">.style1 .childContent").stop().slideUp(50), "IE7" == broswerFlag ? $(".LeftNav_title").animate({
			marginLeft: -($(".LeftNav_title").width() - minWidth)
		}, 200).find("b").addClass("active") : $(".LeftNav_title").animate({
			marginLeft: -($(".LeftNav_title").width() - minWidth)
		}, 200).find("b").addClass("active"), show_on = 1, click_off = 0, $(".LeftNav_win").css("overflow", "visible"), $(".stair_win .style1").css("position", "relative"), $(".stair_win .style1>a b").removeClass("rotate"), $("#lbox").addClass("menu_collapse"), $(".menu_collapse .stair_win .style1 .childContent").css("left", minWidth), b = $(".menu_collapse .stair_win .menuContent"), c = 0; c < b.length; c++) for (d = 0; d < b.eq(c).find(".style1").length; d++) b.eq(c).find(".style1").eq(d).children().length < 2 && (b.eq(c).find(".style1").eq(d).find(">a").attr("title", b.eq(c).find(".style1").eq(d).find(">a>span").text()), 0 == setting.data.tip || b.eq(c).find(".style1").eq(d).find(">a").tip({
			auto: !0,
			arrowDirection: "left",
			arrowDistanceY: 15,
			distanceY: 2
		}));
		setting.data.lefticonTab && $(".stair_win").find("a.bigNav").removeClass("active")
	}
}
function initMenuNav(a, b) {
	var g, e = 10;
	a = transition(b, a), g = $(".stair_win"), e = 10, creatOption(b, a, g, e), b.data.topMenu ? $(".stair_win").find(".menuContent").hide().eq(0).show() : $(".stair_win").find(".menuContent").show(), b.data.topMenu ? ($("#stair_win").find(".menuContent .style1>a").click(function() {
		click_off && ($(this).find("b").hasClass("rotate") ? ($(this).next(".childContent").stop().slideUp(200), $(this).find("b").removeClass("rotate")) : ($(this).next(".childContent").stop().slideDown(200), $(this).parent(".style1").siblings(".style1").find(".childContent").stop().slideUp(200), $(this).find("b").addClass("rotate").parents(".style1").siblings(".style1").find(">a b").removeClass("rotate")))
	}), $("#stair_win").find(".menuContent .style2>a").click(function() {
		"javascript:;" != $(this).attr("href") && ($(".style1 a").removeClass("hover"), $(this).addClass("hover")), $(this).find("b").hasClass("rotate") ? ($(this).siblings(".style2").stop().slideUp(200), $(this).find("b").removeClass("rotate")) : ($(this).siblings(".style2").stop().slideDown(200), $(this).parent(".style2").siblings(".style2").find(".style2").stop().slideUp(200), $(this).parent(".style2").siblings(".style2").find("a b").removeClass("rotate"), $(this).find("b").addClass("rotate").parents(".style1").siblings(".style1").find(">a b").removeClass("rotate"))
	})) : ($("#stair_win").find(".style1>a").click(function() {
		$("#stair_win").find(".style1 .style2 .style2").stop().slideUp(100), click_off && ($(this).find("b").hasClass("rotate") ? ($(this).next(".childContent").stop().slideUp(200).find("b").removeClass("rotate"), $(this).removeClass("active").find("b").removeClass("rotate").parents(".style1")) : ($(this).next(".childContent").stop().slideDown(200), $(this).parent(".style1").siblings(".style1").find(".childContent").stop().slideUp(200), $(this).find("b").addClass("rotate").parents(".style1").siblings(".style1").find(">a b").removeClass("rotate"), $(this).addClass("active").parents(".style1").siblings(".style1").find(">a").removeClass("active")))
	}), $(".childContent .style2 a").click(function() {
		$(this).parents(".style1").siblings("style1").find("b").removeClass("rotate"), $(this).parent(".style2").siblings(".style2").find(".style2").stop().slideUp(100), $(this).find("b").hasClass("rotate") ? ($(this).siblings(".style2").stop().slideUp(200), $(this).find("b").removeClass("rotate")) : ($(this).siblings(".style2").stop().slideDown(200), $(this).find("b").addClass("rotate").parents(".style2").siblings(".style2").find(">a b").removeClass("rotate"))
	})), "min" == b.data.state && switchMenu(0), $(".nav_more").hover(function() {
		$(this).find(".nav_more_content").stop().slideToggle(100)
	}), old_width = $("#bs_left").width(), $(".LeftNav_title b").click(function() {
		$(this).hasClass("active") ? switchMenu(1) : switchMenu(0)
	}), $(".stair_win .style1").hover(function() {
		var a, b, c, d;
		0 != show_on && ($(this).find(".childContent").addClass("active").stop().show(), 0 != $(this).find(".childContent").length && (a = $(this).find(".childContent").offset().top), b = $(window).height(), c = $(this).find(".childContent").height(), d = b - a - c, 0 > d && $(this).find(".childContent").stop().animate({
			top: -(a - 120)
		}))
	}, function() {
		0 != show_on && ($(this).find(".childContent").removeClass("active").stop().hide(), $(this).find(".childContent").removeClass("hover"), $(this).find(".childContent").stop().animate({
			top: 0
		}))
	}), $(".setting").hover(function() {
		0 == $(this).attr("slide") || "false" == $(this).attr("slide") ? $(this).find("ul").stop().toggle() : $(this).find("ul").stop().slideToggle(200)
	})
}
function backHome() {
	document.getElementById("frmright").contentWindow.tabAddHandler("tab_index")
}

function load(){
	$.modal.loading("数据加载中，请稍后...");
    $('.masked-relative iframe:visible').load(function () {
    	$("#frmright").contents().find(".groupTitle span").text(positionContent); 
    	$.modal.closeLoading();
    });
}

function closeMapPanel() {
	$(".map_content").hide()
}
var old_width, firstNum = 0,
	show_on = 0,
	click_off = 1,
	minWidth = 45;