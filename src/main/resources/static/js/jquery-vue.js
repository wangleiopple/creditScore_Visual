(function($) {
	$.fn.useVue = function(vue) {
		var html = $(this).html();
		var app_id = "app_" + new Date().getTime();
		var appEl = $('<div></div>').insertAfter($(this)).append(html).attr("id", app_id);
		vue.el = "#" + app_id;
		var app = new Vue(vue);
		return app;
	}
})(jQuery);
